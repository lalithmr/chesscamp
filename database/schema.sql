CREATE TABLE registration (
    id BIGSERIAL PRIMARY KEY,
    student_name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    parent_name VARCHAR(100) NOT NULL,
    phone VARCHAR(15) NOT NULL,
    email VARCHAR(100) NOT NULL,
    level VARCHAR(50) NOT NULL,
    batch VARCHAR(50) NOT NULL,
    has_chess_set VARCHAR(10) NOT NULL,
    needs_premium_chess_set VARCHAR(10)
);
