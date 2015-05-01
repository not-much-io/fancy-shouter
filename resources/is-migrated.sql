-- Check if any data in shouts table
SELECT count(*)  FROM information_schema.tables
WHERE table_name='shouts'
