
public class Main {
    public static void main(String[] args) {
        String XmlData = "Sample Data";
        JsonAnalyticsTool jsonAnalyticsTool = new JsonAnalyticsTool(XmlData);
        jsonAnalyticsTool.AnayseData();

        AnalyticsTool analyticsTool = new XmlToJsonAdapter(XmlData);
        analyticsTool.AnalyseData();
    }
}