import com.amazonaws.services.lambda.runtime.Context;

public class Lambdafunction {
    public String handleRequest(String input, Context context) {
        context.getLogger().log("Input: " + input);
        return "Lambda - " + input;
    }
}
