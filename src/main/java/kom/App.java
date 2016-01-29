package kom;

import org.apache.commons.math3.analysis.UnivariateFunction;
import org.apache.commons.math3.analysis.integration.TrapezoidIntegrator;

public class App {
  public static void main(String[] args) {
    UnivariateFunction f = new UnivariateFunction() {
      public double value(double x) {
        return Math.sin(x);
      }
    };
    TrapezoidIntegrator integrator = new TrapezoidIntegrator();
    double value = integrator.integrate(10000, f, 0, Math.PI);
    System.out.println(value);
  }
}
