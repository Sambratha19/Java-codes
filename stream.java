package check1;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;


public class Streams {
	void Byte_InputStream() {
		byte[] array = new byte[100];

	    try {
	      InputStream input = new FileInputStream("input.txt");

	      System.out.println("Available bytes in the file: " + input.available());

	      // Read byte from the input stream
	      input.read(array);
	      System.out.println("Data read from the file: ");

	      // Convert byte array into string
	      String data = new String(array);
	      System.out.println(data);

	      // Close the input stream
	      input.close();
	    }
	    catch (Exception e) {
	      e.getStackTrace();
	    }
		
	}
	void Byte_OutputStream() {
		String data = "This is a line of text inside the file.";
		try {
			OutputStream out = new FileOutputStream("output.txt");
			// Converts the string into bytes
			byte[] dataBytes = data.getBytes();
			out.write(dataBytes);
			System.out.println("Data is written to the file.");
			out.close();
		}

        catch (Exception e) {
        	e.getStackTrace();
        }
		
	}
	void Byte_File_InputStream(){
		try {
	        FileInputStream input = new FileInputStream("input.txt");

	        System.out.println("Data in the file: ");

	        // Reads the first byte
	        int i = input.read();

	       while(i != -1) {
	           System.out.print((char)i);

	           // Reads next byte from the file
	           i = input.read();
	        }
	        input.close();
	     }

	     catch(Exception e) {
	        e.getStackTrace();
	     }
	}
	void Byte_File_OutputStream() {
		String data = "This is a line of text inside the file.";

        try {
            FileOutputStream output = new FileOutputStream("output.txt");

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);

            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
	}
	void Byte_ByteArrayInputStream() {
		byte[] array = {1, 2, 3, 4};
		try {
			ByteArrayInputStream input = new ByteArrayInputStream(array);
			System.out.print("The bytes read from the input stream: ");
			for(int i= 0; i < array.length; i++) {
				int data = input.read();
				System.out.print(data + ", ");
				}
			input.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}

	}
	void Byte_ByteArrayOutputStream() {
		String data = "This is a line of text inside the string.";

	    try {
	      // Creates an output stream
	      ByteArrayOutputStream out = new ByteArrayOutputStream();
	      byte[] array = data.getBytes();

	      // Writes data to the output stream
	      out.write(array);

	      // Retrieves data from the output stream in string format
	      String streamData = out.toString();
	      System.out.println("Output stream: " + streamData);

	      out.close();
	    }

	    catch(Exception e) {
	      e.getStackTrace();
	    }
	}
	void Byte_ObjectInputStream_and_ObjectOutputStream() {
		int data1 = 5;
        String data2 = "This is programiz";

        try {
            FileOutputStream file = new FileOutputStream("file.txt");
            ObjectOutputStream output = new ObjectOutputStream(file);

            // Writing to the file using ObjectOutputStream
            output.writeInt(data1);
            output.writeObject(data2);

            FileInputStream fileStream = new FileInputStream("file.txt");
            // Creating an object input stream
            ObjectInputStream objStream = new ObjectInputStream(fileStream);

            //Using the readInt() method
            System.out.println("Integer data :" + objStream.readInt());

            // Using the readObject() method
            System.out.println("String data: " + objStream.readObject());

            output.close();
            objStream.close();
        }
        catch (Exception e) {
            e.getStackTrace();
        }
	}
	
	public static void main(String[] args) {
		Streams str=new Streams();
		System.out.println("INPUT STREAM");
		str.Byte_InputStream();
		System.out.println("OUTPUT STREAM");
		str.Byte_OutputStream();
		System.out.println("FILE INPUT STREAM");
		str.Byte_File_InputStream();
		System.out.println("FILE OUTPUT STREAM");
		str.Byte_File_OutputStream();
		System.out.println("BYTEARRAY INPUT STREAM");
		str.Byte_ByteArrayInputStream();
		System.out.println("BYTEARRAY OUTPUT STREAM");
		str.Byte_ByteArrayOutputStream();
		System.out.println("OBJECT INPUT STREAM and OBJECT OUTPUT STREAM");
		str.Byte_ObjectInputStream_and_ObjectOutputStream();
		
		// TODO Auto-generated method stub

	}

}
