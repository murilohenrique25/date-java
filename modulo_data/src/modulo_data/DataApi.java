package modulo_data;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataApi {
	
	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		
		/*System.out.println(dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println(horaAtual.format(DateTimeFormatter.ofPattern("HH:mm")));

		LocalDateTime dataAtualHora = LocalDateTime.now();
		System.out.println(dataAtualHora.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));*/
		
		System.out.println(dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana: " +dataAtual.getDayOfWeek());
		
		System.out.println("Dia do mes: " +dataAtual.getDayOfMonth());
		
		System.out.println("Dia da ano: " +dataAtual.getDayOfYear());
		
		System.out.println("Mes : " +dataAtual.getMonthValue());
		
		System.out.println("Ano : " +dataAtual.getYear());
		
	}
}
