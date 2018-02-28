/* WORD LADDER Main.java
 * EE422C Project 3 submission by
 * Replace <...> with your actual data.
 * Nicole Finks
 * ncf346
 * <Student1 5-digit Unique No.>
 * Slip days used: <0>
 * Git URL: https://github.com/NFinks/Project3_ncf346.git
 * Spring 2018
 */


package assignment3;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Main {
	
	// static variables and constants only here.
	
	public static void main(String[] args) throws Exception {
		
		Scanner kb;	// input Scanner for commands
		PrintStream ps;	// output file, for student testing and grading only
		// If arguments are specified, read/write from/to files instead of Std IO.
		if (args.length != 0) {
			kb = new Scanner(new File(args[0]));
			ps = new PrintStream(new File(args[1]));
			System.setOut(ps);			// redirect output to ps
		} else {
			kb = new Scanner(System.in);// default input from Stdin
			ps = System.out;			// default output to Stdout
		}
		initialize();
		parse(kb);
		// TODO methods to read in words, output ladder
	}
	
	public static void initialize() {
		// initialize your static variables or constants here.
		// We will call this method before running our JUNIT tests.  So call it 
		// only once at the start of main.
		makeDictionary();
		//parse(kb);
		
	}
	
	/**
	 * @param keyboard Scanner connected to System.in
	 * @return ArrayList of Strings containing start word and end word. 
	 * If command is /quit, return empty ArrayList. 
	 * I am assuming that the words must be of the same length
	 */
	public static ArrayList<String> parse(Scanner keyboard) {
		
		/** get first input, ignore white space, make all lower case. */
		String input1 = keyboard.next().trim().toLowerCase(); 
		
		/** check if /quit. */
		if (input1 == "/quit") { 
			return null; 
		}
		
		/**get second input, ignore white space, make all lower case*/
		String input2 = keyboard.next().trim().toLowerCase(); 
		
		// create array list with two words
		ArrayList<String> input = new ArrayList<String>(2);
		input.add(input1);
		input.add(input2);
		
		System.out.println(input1+ " " + input2);
		return input;
	}
	
	public static ArrayList<String> getWordLadderDFS(String start, String end) {
		
		// Returned list should be ordered start to end.  Include start and end.
		// If ladder is empty, return list with just start and end.
		// TODO some code
		Set<String> dict = makeDictionary();
		// TODO more code
		
		return null; // replace this line later with real return
	}
	
    public static ArrayList<String> getWordLadderBFS(String start, String end) {
		
		// TODO some code
		Set<String> dict = makeDictionary();
		// TODO more code
		
		return null; // replace this line later with real return
	}
    
	
	public static void printLadder(ArrayList<String> ladder) {
		
	}
	// TODO
	// Other private static methods here


	/* Do not modify makeDictionary */
	public static Set<String>  makeDictionary () {
		Set<String> words = new HashSet<String>();
		Scanner infile = null;
		try {
			infile = new Scanner (new File("five_letter_words.txt"));
		} catch (FileNotFoundException e) {
			System.out.println("Dictionary File not Found!");
			e.printStackTrace();
			System.exit(1);
		}
		while (infile.hasNext()) {
			words.add(infile.next().toUpperCase());
		}
		return words;
	}
}
