class Student extends Person {
	private int stuId;
	private int sub1Marks;
	private char grade;
	private double percentage;
	private char section;
	public Student(int stuId, int sub1Marks, char grade, double percentage, char section) {
		super();
		this.stuId = stuId;
		this.sub1Marks = sub1Marks;
		this.grade = grade;
		this.percentage = percentage;
		this.section = section;
	}
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public int getSub1Marks() {
		return sub1Marks;
	}
	public void setSub1Marks(int sub1Marks) {
		this.sub1Marks = sub1Marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public char getSection() {
		return section;
	}
	public void setSection(char section) {
		this.section = section;
	}
	
		
	}
