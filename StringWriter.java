public class StringWriter {
    public File file = new File ("file.txt");
    public void convert (File file) {

        System.out.println ("Writing to message: " + file);
    }

    public void writingToFile (String message)
    {
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))) {
    writer.write(message);
    writer.newLine();  // method provided by BufferedWriter
} catch (IOException e) {}
    }

    public void FiletoString ()
    {
        Scanner scanner = new Scanner(file);
String text = scanner.useDelimiter("\\A").next();
scanner.close(); // Put this call in a finally block
    }

}