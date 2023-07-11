class TestPG  extends PGStudent{

	public static void main(String[] args) {
		PGStudent pg=new PGStudent(574,98, 'A', 92, 'B',35435,"cse","AI","jntuk",2019,2023);
		System.out.println(pg.getSub1Marks());
		System.out.println(pg.getSub1Marks());
		System.out.println(pg.getGrade());
		System.out.println(pg.getPercentage());
		System.out.println(pg.getSection());
		System.out.println(pg.getGateScore());
		System.out.println(pg.getDept());
		System.out.println(pg.getSpecialization());
		System.out.println(pg.getUniversity());
		System.out.println(pg.getAdmittedYear());
		System.out.println(pg.getUGpassoutyr());
		
		

	}

}
