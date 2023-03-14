interface Writer {
    void write(String key, String value);
}

class JSONWriter implements Writer {
    @Override
    public void write(String key, String value) {

        System.out.println("'" + key + "' : '" + value + "'");
    }
}

class XMLWriter implements Writer {
    @Override
    public void write(String key, String value) {

        System.out.println("<" + key + ">" + value + "</" + key + ">");
    }
}

public class Main {
    public static void main(String[] args) {
        Writer jsonWriter = new JSONWriter();
        jsonWriter.write("salutacio", "Hola");

        Writer xmlWriter = new XMLWriter();
        xmlWriter.write("salutacio", "Hola");
    }
}