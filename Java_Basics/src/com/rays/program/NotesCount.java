package com.rays.program;

public class NotesCount {

	public static void main(String[] args) {
		
		int[] notes = { 2000, 500, 200, 100};

		int count = 0;

		int rupees = 2800;

		for (int i = 0; i < notes.length; i++) {
			
			count = rupees / notes[i];
			
			if (count > 0) {
				System.out.println(notes[i] + " = " + count);
			}
			
			rupees = rupees % notes[i];
		}

	}
}
