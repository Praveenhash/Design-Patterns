public class XmlToJsonAdapter implements AnalyticsTool{

    private JsonAnalyticsTool  jsonAnalyticsTool;

    public XmlToJsonAdapter(String XmlData){
        System.out.println("Converting the Xml data into "+XmlData+" Json format");
        String newData = XmlData + " in json";
        System.out.println(newData);
        jsonAnalyticsTool = new JsonAnalyticsTool(newData);
    }
    @Override
    public void AnalyseData() {
        jsonAnalyticsTool.AnayseData();
    }
}
