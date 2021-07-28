package modulo_data;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PeriodJavaData {
	
	public static void main(String[] args) {
		LocalDate dataBase = LocalDate.of(2020, 2, 7);
		
		/*LocalDate dataNova = LocalDate.of(2021, 7, 15);
		
		System.out.println("Data Antiga é maior que data nova? "+dataAntiga.isAfter(dataNova));
		
		Period periodo = Period.between(dataBase, dataNova);
		
		System.out.println(periodo.getYears() + " Anos " + periodo.getMonths() + " meses " + periodo.getDays() + " dias");*/
		
				
		for(int parcela = 1; parcela <=12; parcela++) {
			dataBase = dataBase.plusMonths(1);
			System.out.println(parcela+"º com vencimento em " + dataBase.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		}
	}
}
