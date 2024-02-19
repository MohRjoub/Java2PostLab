package tawjihi;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Activity56 {

	public static void main(String[] args) throws IOException {
		DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File("Tawjihi.dat")));
		ArrayList<Tawjihi> students = new ArrayList<>();
		String[] scientificStudent = { "111111111", "123456789", "Ali", "M", "School1" };
		String[] literaryStudent = { "222222222", "987654321", "Ahmad", "M", "School2" };
		ArrayList<subject> scientificSubject = new ArrayList<>();
		ArrayList<subject> literarySubject = new ArrayList<>();
		scientificSubject.add(new subject("Math", "Mandatory", 190, 200));
		scientificSubject.add(new subject("Physics", "Mandatory", 85));
		scientificSubject.add(new subject("Arabic", "Mandatory", 85));
		scientificSubject.add(new subject("English", "Mandatory", 88));
		scientificSubject.add(new subject("Biology", "Elective1", 80));
		scientificSubject.add(new subject("Chemistry", "Elective1", 75));
		scientificSubject.add(new subject("History", "Elective2", 92));
		scientificSubject.add(new subject("Religious Education", "Elective2", 70));

		literarySubject.add(new subject("Arabic", "Mandatory", 149, 150));
		literarySubject.add(new subject("History", "Mandatory", 100));
		literarySubject.add(new subject("Physics", "Mandatory", 100));
		literarySubject.add(new subject("English", "Mandatory", 149, 150));
		literarySubject.add(new subject("Geography", "Elective1", 10));
		literarySubject.add(new subject("Religious Education", "Elective1", 100));
		literarySubject.add(new subject("Scientific Culture", "Elective2", 10));
		literarySubject.add(new subject("Technology", "Elective2", 100));

		for (int i = 0; i < 2; i++) {
			dataOutputStream.writeInt(Integer.parseInt(scientificStudent[0]));
			dataOutputStream.writeUTF(scientificStudent[2]);
			dataOutputStream.writeChar(scientificStudent[3].charAt(0));
			dataOutputStream.writeUTF(scientificStudent[4]);
			dataOutputStream.writeUTF("scientific");
			dataOutputStream.writeInt(Integer.parseInt(scientificStudent[1]));
			dataOutputStream.writeInt(2024);
			dataOutputStream.writeInt(7);

			for (int j = 0; j < scientificSubject.size(); j++) {
				dataOutputStream.writeUTF(scientificSubject.get(j).getTitle());
				dataOutputStream.writeUTF(scientificSubject.get(j).getType());
				dataOutputStream.writeInt(scientificSubject.get(j).getMark());
				dataOutputStream.writeInt(scientificSubject.get(j).getMaxMark());
			}

			dataOutputStream.writeInt(Integer.parseInt(literaryStudent[0]));
			dataOutputStream.writeUTF(literaryStudent[2]);
			dataOutputStream.writeChar(literaryStudent[3].charAt(0));
			dataOutputStream.writeUTF(literaryStudent[4]);
			dataOutputStream.writeUTF("literary");
			dataOutputStream.writeInt(Integer.parseInt(literaryStudent[1]));
			dataOutputStream.writeInt(2024);
			dataOutputStream.writeInt(7);

			for (int j = 0; j < literarySubject.size(); j++) {
				dataOutputStream.writeUTF(literarySubject.get(j).getTitle());
				dataOutputStream.writeUTF(literarySubject.get(j).getType());
				dataOutputStream.writeInt(literarySubject.get(j).getMark());
				dataOutputStream.writeInt(literarySubject.get(j).getMaxMark());
			}
		}
		dataOutputStream.close();
		try (DataInputStream in = new DataInputStream(new FileInputStream("Tawjihi.dat"))) {
			int scientificID = in.readInt();
			String scientificName = in.readUTF();
			char scientificGender = in.readChar();
			String scientificSchool = in.readUTF();
			String scientificBranch = in.readUTF();
			int scientificSeatingNum = in.readInt();
			int scientificYear = in.readInt();
			int scientificNumOfSubjects = in.readInt();
			students.add(new scientific(scientificSeatingNum, scientificID, scientificName, scientificGender,
					scientificSchool));
			students.get(0).setYear(scientificYear);
			while (scientificNumOfSubjects >= 0) {
				students.get(0).addSubject(new subject(in.readUTF(), in.readUTF(), in.readInt(), in.readInt()));
				scientificNumOfSubjects--;
			}
			System.out.println(students.get(0));

			int literaryID = in.readInt();
			String literaryName = in.readUTF();
			char literaryGender = in.readChar();
			String literarySchool = in.readUTF();
			String literaryBranch = in.readUTF();
			int literarySeatingNum = in.readInt();
			int literaryYear = in.readInt();
			int literaryNumOfSubjects = in.readInt();
			students.add(new literary(literarySeatingNum, literaryID, literaryName, literaryGender, literarySchool));
			students.get(1).setYear(literaryYear);
			while (literaryNumOfSubjects >= 0) {
				students.get(1).addSubject(new subject(in.readUTF(), in.readUTF(), in.readInt(), in.readInt()));
				literaryNumOfSubjects--;
			}

			System.out.println(students.get(1));

		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
