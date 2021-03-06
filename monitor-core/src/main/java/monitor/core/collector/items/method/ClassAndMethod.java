package monitor.core.collector.items.method;

/**
 * Created by lizhitao on 2018/1/9.
 * ClassAndMethod
 */
public class ClassAndMethod {
    private String className;
    private String methodName;

    public ClassAndMethod(String className, String methodName) {
        this.className = className;
        this.methodName = methodName;
    }

    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return this.methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    @Override
    public String toString() {
        return "ClassAndMethod{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                '}';
    }
}