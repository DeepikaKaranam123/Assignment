class PGStudent extends Student {
	
		
    private int gateScore;
    private String dept;
    private String specialization;
    private String university;
    private int admittedYear;
    private int UGpassoutyr;

    public PGStudent(int stuId, int sub1Marks, char grade, double percentage, char section, int gateScore,
            String dept, String specialization, String university, int admittedYear, int uGpassoutyr) {
        super(stuId, sub1Marks, grade, percentage, section);
        this.gateScore = gateScore;
        this.dept = dept;
        this.specialization = specialization;
        this.university = university;
        this.admittedYear = admittedYear;
        UGpassoutyr = uGpassoutyr;
    }
    
    public int getGateScore() {
        return gateScore;
    }
    public void setGateScore(int gateScore) {
        this.gateScore = gateScore;
    }
    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) {
        this.university = university;
    }
    public int getAdmittedYear() {
        return admittedYear;
    }
    public void setAdmittedYear(int admittedYear) {
        this.admittedYear = admittedYear;
    }
    public int getUGpassoutyr() {
        return UGpassoutyr;
    }
    public void setUGpassoutyr(int uGpassoutyr) {
        UGpassoutyr = uGpassoutyr;
    }
    
    
    
}
