package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestDrivenDevelopment {

    /**
     * 3.5 Нужно написать (TDD) класс MoodAnalyser, который оценивает фразы по настроению
     */
    @Test
    void testMoodSadAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyzedMood("Это сообщение грустное");
        assertThat(mood).isEqualTo("sad");
    }
    @Test
    void testMoodGoodAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyzedMood("Это сообщение хорошее");
        assertThat(mood).isEqualTo("good");
    }
    @Test
    void testMoodOtherAnalysis() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyzedMood("Это сообщение непонятное");
        assertThat(mood).isEqualTo("other");
    }


}