public class JsonAnalyticsTool {
    private String JsonData;

    public JsonAnalyticsTool(String JsonData){
        this.JsonData = JsonData;
    }

    public void AnayseData(){
        if(JsonData.contains("json")){
            System.out.println("Analysing the json data - "+JsonData);
        }else{
            System.out.println("The file type is incompatible, Can't analyse...!");
        }
    }
}
