import java.io.*;
import java.text.*;
import java.util.*;
<<<<<<< HEAD

public class StudentList {

    public static void main(String[] args) {

		import java.io.*;
		import java.text.*;
		import java.util.*;
		
		public class StudentList {
		
			public static void main(String[] args) {
		
				// Check for invalid arguments
		
		// Check if user pass no argument
				if (args.length==0){
					System.out.println("You must have to put at least one argument.");
				}
		
				else if (args.length>1){
					System.out.println("Multipled arguments found ! You must have to put exactly one argument to run this program.");
		
				}
		// Check if user pass more than 1 argument
				else if (args[0].length()>1){
					System.out.println("Please pass the correct argument.");
		
				}
		
		//Check if user pass 'a' to see the list of students.
		
				else if (args[0].equals("a")) {
		
					System.out.println("Loading data ...");
		// This method will create object of BufferReader and load lines in studentNames String Array. It is used to avoid repeatative calling
					try {
		
						BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
		
						String r = s.readLine();
						String[] i = r.split(",");
		
						for (String j : i) {
							System.out.println(j);
						}
		
					}
		
					catch (Exception e) {
		
					}
		
					System.out.println("Data Loaded.");
				}
		//Check if user pass 'r' to see a random student.
		
				else if (args[0].equals("r")) {
		
					System.out.println("Loading data ...");
		
					try {
		
						BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
		
						String r = s.readLine();
						System.out.println(r);
		
						String[] i = r.split(",");
		
						Random x = new Random();
						int y = x.nextInt();
		
						System.out.println(i[y]);
		
					}
		
					catch (Exception e) {
		
					}
		
					System.out.println("Data Loaded.");
				}
		
				else if (args[0].contains("+")) {
		
					System.out.println("Loading data ...");
		
					try {
		
						BufferedWriter s = new BufferedWriter(new FileWriter("students.txt", true));
		
						String t = args[0].substring(1);
						Date d = new Date();
		
						String df = "dd/mm/yyyy-hh:mm:ss a";
						DateFormat dateFormat = new SimpleDateFormat(df);
		
						String fd = dateFormat.format(d);
						s.write(", " + t + "\nList last updated on " + fd);
						s.close();
					}
		
					catch (Exception e) {
		
					}
		
					System.out.println("Data Loaded.");
		
				}
		
		
				else if (args[0].contains("?")) {
		
					System.out.println("Loading data ...");
		
					try {
						BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
		
						String r = s.readLine();
						String[] i = r.split(",");
		
						boolean done = false;
		
						String t = args[0].substring(1);
		
						for (int idx = 0; idx < i.length && !done; idx++) {
							if (i[idx].equals(t)) {
								System.out.println("We found it!");
								done = true;
							}
						}
					}
		
					catch (Exception e) {
		
					}
		
					System.out.println("Data Loaded.");
				}
		
				else if (args[0].contains("c")) {
		
					System.out.println("Loading data ...");
		
					try {
		
						BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
		
						String D = s.readLine();
		
						char[] a = D.toCharArray();
						boolean in_word = false;
		
						int count = 0;
		
						for (char c : a) {
							if (c == ' ') {
								if (!in_word) {
									count++;
									in_word = true;
								}
		
								else {
									in_word = false;
								}
							}
						}
		
			 //Check if user pass '+' to add a student name
				   System.out.println(count + " word(s) found " + a.length);
					}
		
					catch (Exception e) {
		
					}
		
					System.out.println("Data Loaded.");
		
=======
public class StudentList {
	public static void main(String[] args) {
		// Check arguments
		if (args[0].equals("a")) {
			if (args.length != 1) {
				System.out.println("please enter valid arg");
			} else {
				System.out.println("Loading data ...");
				try {
					BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
					String r = s.readLine();
					String i[] = r.split(",");
					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
					String reaString = bufferedReader.readLine();
					String i[] = reaString.split(",");
					for (String j : i) {
						System.out.println(j);

@@ -29,9 +29,9 @@ public static void main(String[] args) {
			} else {
				System.out.println("Loading data ...");
				try {
					BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
					String r = s.readLine();
					String i[] = r.split(",");
					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
					String readString = bufferedReader.readLine();
					String i[] = readString.split(",");
					int y = (int) ((double) Math.random() * (int) i.length);
					System.out.println(i[y]);
				} catch (Exception e) {
>>>>>>> task-3
				}
				System.out.println("Data Loaded.");
			}
<<<<<<< HEAD
		}

// Check if user pass no argument
        if (args.length==0){
            System.out.println("You must have to put at least one argument.");
        }

        else if (args.length>1){
            System.out.println("Multipled arguments found ! You must have to put exactly one argument to run this program.");

        }
// Check if user pass more than 1 argument
        else if (args[0].length()>1){
            System.out.println("Please pass the correct argument.");

        }

//Check if user pass 'a' to see the list of students.

        else if (args[0].equals("a")) {

            System.out.println("Loading data ...");
// This method will create object of BufferReader and load lines in studentNames String Array. It is used to avoid repeatative calling
            try {

                BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));

                String r = s.readLine();
                String[] i = r.split(",");

                for (String j : i) {
                    System.out.println(j);
                }

            }

            catch (Exception e) {

            }

            System.out.println("Data Loaded.");
        }
//Check if user pass 'r' to see a random student.

        else if (args[0].equals("r")) {

            System.out.println("Loading data ...");

            try {

                BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));

                String r = s.readLine();
                System.out.println(r);

                String[] i = r.split(",");

                Random x = new Random();
                int y = x.nextInt();

                System.out.println(i[y]);

            }

            catch (Exception e) {

            }

            System.out.println("Data Loaded.");
        }

        else if (args[0].contains("+")) {

            System.out.println("Loading data ...");

            try {

                BufferedWriter s = new BufferedWriter(new FileWriter("students.txt", true));

                String t = args[0].substring(1);
                Date d = new Date();

                String df = "dd/mm/yyyy-hh:mm:ss a";
                DateFormat dateFormat = new SimpleDateFormat(df);

                String fd = dateFormat.format(d);
                s.write(", " + t + "\nList last updated on " + fd);
                s.close();
            }

            catch (Exception e) {

            }

            System.out.println("Data Loaded.");

        }


        else if (args[0].contains("?")) {

            System.out.println("Loading data ...");

            try {
                BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));

                String r = s.readLine();
                String[] i = r.split(",");

                boolean done = false;

                String t = args[0].substring(1);

                for (int idx = 0; idx < i.length && !done; idx++) {
                    if (i[idx].equals(t)) {
                        System.out.println("We found it!");
                        done = true;
                    }
                }
            }

            catch (Exception e) {

            }

            System.out.println("Data Loaded.");
        }

        else if (args[0].contains("c")) {

            System.out.println("Loading data ...");

            try {

                BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));

                String D = s.readLine();

                char[] a = D.toCharArray();
                boolean in_word = false;

                int count = 0;

                for (char c : a) {
                    if (c == ' ') {
                        if (!in_word) {
                            count++;
                            in_word = true;
                        }

                        else {
                            in_word = false;
                        }
                    }
                }

     //Check if user pass '+' to add a student name
           System.out.println(count + " word(s) found " + a.length);
            }

            catch (Exception e) {

            }

            System.out.println("Data Loaded.");

        }
    }
=======
		} else if (args[0].contains("+")) {
			System.out.println("Loading data ...");
			try {
				BufferedWriter s = new BufferedWriter(new FileWriter("students.txt", true));
				String t = args[0].substring(1);
				Date d = new Date();
				BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("students.txt", true));
				String inputString = args[0].substring(1);
				Date newdDate = new Date();
				String df = "dd/mm/yyyy-hh:mm:ss a";
				DateFormat dateFormat = new SimpleDateFormat(df);
				String fd = dateFormat.format(d);
				s.write(", " + t + "\nList last updated on " + fd);
				s.close();
				String fd = dateFormat.format(newdDate);
				bufferedWriter.write(", " + inputString + "\nList last updated on " + fd);
				bufferedWriter.close();
			} catch (Exception e) {
			}

			System.out.println("Data Loaded.");
		} else if (args[0].contains("?")) {
			System.out.println("Loading data ...");
			try {
				BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
				String r = s.readLine();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
				String r = bufferedReader.readLine();
				String i[] = r.split(",");
				boolean done = false;
				String t = args[0].substring(1);
				String inpuString = args[0].substring(1);
				for (int idx = 0; idx < i.length && !done; idx++) {
					if (i[idx].equals(t)) {
					if (i[idx].equals(inpuString)) {
						System.out.println("We found it!");
						done = true;
					}
				}
			} catch (Exception e) {
			}
			System.out.println("Data Loaded.");
		} else if (args[0].contains("c")) {
			System.out.println("Loading data ...");
			try {
				BufferedReader s = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
				String D = s.readLine();
				char a[] = D.toCharArray();
				BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("students.txt")));
				String newdate = bufferedReader.readLine();
				char a[] = newdate.toCharArray();
				boolean in_word = false;
				int count = 0;
				for (char c : a) {
					if (c == ' ') {
						if (!in_word) {
							count++;
							in_word = true;
						} else {
							in_word = false;
						}
					}
				}
				System.out.println(count + " word(s) found " + a.length);
			} catch (Exception e) {
			}
			System.out.println("Data Loaded.");
		}
	}
>>>>>>> task-3
}