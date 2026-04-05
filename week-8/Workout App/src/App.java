import java.util.List;

public class App
{
    private List<Workout> workouts;

    public App()
    {
    }

    public List<Workout> getWorkouts()
    {
        return this.workouts;
    }

    public void setWorkouts(List<Workout> workouts)
    {
        this.workouts = workouts;
    }

    public void addWorkout(Workout workout)
    {
        this.workouts.add(workout);
    }
}
