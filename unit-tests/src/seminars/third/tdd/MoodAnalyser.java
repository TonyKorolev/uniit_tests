package seminars.third.tdd;

public class MoodAnalyser {

    public String analyzedMood(String message) {
        if (message.contains("грустное"))
            return "sad";
        if (message.contains("хорошее"))
            return "good";
        return "other";
    }
}
