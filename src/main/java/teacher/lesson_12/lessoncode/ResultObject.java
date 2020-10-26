package teacher.lesson_12.lessoncode;

public class ResultObject {

    public String result;
    public String errorMessage;

    public ResultObject(String result) {
        this.result = result;
    }

    public ResultObject(String result, String errorMessage) {
        this.result = result;
        this.errorMessage = errorMessage;
    }
}
