package com.techelevator;

public class HomeworkAssignment {
	
	int totalMarks;
	int possibleMarks;
	String submitterName;
	
	
	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public String getLetterGrade() {
		
		double numberGrade = (totalMarks/(double) possibleMarks) * 100;
		
		if(numberGrade >= 90 ) {
			return "A";
		}
		else if(numberGrade >= 80) {
			return "B";
		}
		else if(numberGrade >= 70) {
			return "C";
		}
		else if(numberGrade >= 60){
			return "D";
		}
		else {
			return "F";
		}

    }
}
