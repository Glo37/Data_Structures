
class Student implements Comparable<Student> {
        Long studentID;
        String name;
        Double avgGrade;
    public Student(double avgGrade, String name, long studentID) {
        this.avgGrade = avgGrade;
        this.name = name;
        this.studentID = studentID;
    }

    @Override
    public int compareTo(Student otherStudent) {

        if (avgGrade == otherStudent.avgGrade) {
            if (name.compareTo(otherStudent.name) == 0) {
                return 0;
            }

            if (name.compareTo(otherStudent.name) < 0) {
                return 1;
            }
            else {
                return -1;
            }
        }

        if (avgGrade < otherStudent.avgGrade) {
            return 1;
        }
        else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return name + "\t\tStudent ID: " + studentID + "\t\tQuiz Grade: " + avgGrade;
    }
}
