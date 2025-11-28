package trainingd7;

//public interface supplier<T> {
//
//	T get();
//}

public interface supplier <T>{
	T accept(T t);
}