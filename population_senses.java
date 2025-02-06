class population_senses
{
	public static void main(String[]args)
	{
		long current_population = 312032486;
		long seconds = (365*24*60*60)*5;
		long birth = seconds/7;
		long death = seconds/13;
		long immi = seconds/45;

		long new_population = current_population+(birth-death+immi);

		System.out.print("NEW POPULATION IS :"+new_population);
		
	}
}
