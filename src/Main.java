import java.util.*;
public class Main {
    public static void main(String[] args) {
        /*
         * Student name: Gloria Ukattah
         * Course and section: ITSE 2438 section 22700.
         * Assignment: Two
         * Description:
         * My program creates a LinkedList of Strings, a HashMap of String and Integer, a TreeSet of Strings,
         * a Queue of Integers, a Stack of Doubles, a Deque of Strings, and a Student class that implements the Comparable interface.
         */
        new Main().go();
    }

    private void go() {
        // Create a LinkedList of Strings
        LinkedList<String> breakfastOptions = new LinkedList<>();
        breakfastOptions.add("One: Eggs and bacon.");
        breakfastOptions.add("Two: Pancakes and syrup.");
        breakfastOptions.add("Three: Waffles and blueberries.");

        System.out.println("These are your options for breakfast: ");

        // Use enhanced for loop to print the strings in the list.
        for (String breakfastName : breakfastOptions) {
            System.out.println(breakfastName);
        }

        // Create a HashMap of String and Integer
        HashMap<String, Integer> secretAgentID = new HashMap<>();
        secretAgentID.put("Raven", 341);
        secretAgentID.put("Wings", 296);
        secretAgentID.put("Badger", 478);

        System.out.println();
        System.out.println("Printing secret agent names and IDs to the screen...");

        // Use enhanced for loop to print the entries in the map.
        for (HashMap.Entry<String, Integer> entry : secretAgentID.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Create a TreeSet of Strings
        TreeSet<String> relatives = new TreeSet<>();
        relatives.add("Aunt Katy");
        relatives.add("Uncle Joe");
        relatives.add("Cousin Erin");
        relatives.add("Aunt Katy");

        System.out.println();
        System.out.println("Printing the names of your relatives who live in the USA...");

        // Use enhanced for loop to print the strings in the set.
        for (String name : relatives) {
            System.out.println(name);
        }

        // Create a Queue of Integers
        Queue<Integer> collegeStudentLunchNumbers = new LinkedList<>();
        collegeStudentLunchNumbers.add(8574);
        collegeStudentLunchNumbers.add(2727);
        collegeStudentLunchNumbers.add(3759);

        System.out.println();
        System.out.println("Printing the lunch numbers of some college students who live in the Bay area... ");

        // Use a while loop to print the numbers in the queue.
        while (!collegeStudentLunchNumbers.isEmpty()) {
            System.out.println(collegeStudentLunchNumbers.remove());
        }

        // Create a Stack of Doubles
        Stack<Double> tempsInCanada = new Stack<>();
        tempsInCanada.push(34.7);
        tempsInCanada.push(86.5);
        tempsInCanada.push(25.4);
        tempsInCanada.push(29.3);
        tempsInCanada.push(25.1);

        System.out.println();
        System.out.println("Printing the temperatures in Canada this week for Monday through Friday...");

        // Use a while loop to print the numbers in the stack.
        while (!tempsInCanada.isEmpty()) {
            System.out.println(tempsInCanada.pop());
        }

        // Create a Deque of Strings.
        Deque<String> medicalDoctors = new LinkedList<>();
        medicalDoctors.addFirst("Cindy Sue");
        medicalDoctors.addFirst("Beck Johnson");
        medicalDoctors.addLast("Harmony Elks");
        medicalDoctors.addFirst("Jessie Carns");
        medicalDoctors.addLast("Anthony Wavers");

        System.out.println();
        System.out.println("Printing the names of some medical doctors who work at San Jose Hospital... ");

        // Use a while loop to print the strings in the deque.
        while (!medicalDoctors.isEmpty()) {
            System.out.println(medicalDoctors.remove());
        }

        // Load some students into the student ArrayList.
        final int NUM_ELEMENTS = 6;
        Student[] studentList = new Student[NUM_ELEMENTS];
        int i;

        studentList[0] = new Student(97.5, "John", 4637465);
        studentList[1] = new Student(34.6, "Kiana", 7503783);
        studentList[2] = new Student(77.5, "Darius", 1863970);
        studentList[3] = new Student(77.5, "Lola", 2756471);
        studentList[4] = new Student(34.6, "Michael", 1758962);
        studentList[5] = new Student(63.2, "Paulina", 5381563);

        Arrays.sort(studentList);

        System.out.println();

        System.out.println("Printing the results from the recent quiz for students at Alec High School...");

        // Print the results from the Student class.
        for (i = 0; i < NUM_ELEMENTS; i++) {
            System.out.println(studentList[i]);
        }
    }

}