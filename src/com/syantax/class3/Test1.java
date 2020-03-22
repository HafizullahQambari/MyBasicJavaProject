package com.syantax.class3;

public class Test1 {

	public static void main(String[] args) {
		private static void getPersonDetails(final Scanner scanner,final PersonService service) {
		    while(true) {
		      System.out.print("Please enter the name of the person and press<enter>: ");
		      String input = scanner.nextLine();
		      final List<Person> personList = service.findPersonByName(input);
		      if(personList != null && !personList.isEmpty()) {
		        for(Person person:personList) {
		          System.out.print(
		              String.format("Person found - Person Id: '%d', Person Name is: '%s',  Gender: '%s'",
		                     person.getPersonId(),person.getName(), person.getGender()));
		          System.out.println(String.format(", Date of birth: '%1$td/%1$tm/%1$tC%1$ty'", person.getDateOfBirth()));
		        }
		      } else {
		        System.out.println(
		            String.format("No Person record found for name: '%s'.", input));
		      }
		      System.out.print("Do you want to find another person? (y/n)");
		      String choice  = scanner.nextLine();
		      if(!"y".equalsIgnoreCase(choice)) {
		        break;
		      }
		    }

		  }
		}

	}

}
