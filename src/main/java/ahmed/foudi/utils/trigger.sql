CREATE OR REPLACE FUNCTION update_general_results_after_stage_completion()
RETURNS TRIGGER AS $$
BEGIN
    IF NEW.is_completed THEN
UPDATE GeneralResult gr
SET
    overall_time = (
        SELECT SUM(r.time)
        FROM Result r
                 JOIN Stage s ON r.stage_id = s.id
        WHERE r.cyclist_id = gr.cyclist_id
          AND s.competition_id = NEW.competition_id
    ),
    overall_rank = (
        SELECT COUNT(DISTINCT r2.time) + 1
        FROM Result r2
                 JOIN Stage s2 ON r2.stage_id = s2.id
        WHERE s2.competition_id = NEW.competition_id
          AND r2.time < (
            SELECT r3.time
            FROM Result r3
                     JOIN Stage s3 ON r3.stage_id = s3.id
            WHERE s3.competition_id = NEW.competition_id
              AND r3.cyclist_id = gr.cyclist_id
        )
    )
WHERE gr.competition_id = NEW.competition_id;
END IF;

RETURN NULL;
END;
$$
LANGUAGE plpgsql;
CREATE TRIGGER update_general_results_trigger
    AFTER UPDATE ON Stage
    FOR EACH ROW
    EXECUTE FUNCTION update_general_results_after_stage_completion();