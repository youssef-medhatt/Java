package myPackage;

public class GenericComplex<T extends Number> {
  private  T real;
  private T img;

  public GenericComplex() {
      real = null;
      img = null;
}
  public GenericComplex(T r, T i) {
        real = r;
        img = i;
    }

    public void setReal(T r){
        real = r;
    }

    public void setImg(T i){
        img = i;
    }

    public T getReal(){
        return real;
    }

    public T getImg(){
        return img;
    }

    public static GenericComplex addComplex(GenericComplex c1, GenericComplex c2) {
        GenericComplex newComplex = new GenericComplex();
        newComplex.setReal(c1.getReal().doubleValue() + c2.getReal().doubleValue());
        newComplex.setImg(c1.getImg().doubleValue() + c2.getImg().doubleValue());

        return newComplex;

    }
    public static GenericComplex subComplex(GenericComplex c1, GenericComplex c2) {
        GenericComplex newComplex = new GenericComplex();
        newComplex.setReal(c1.getReal().doubleValue() - c2.getReal().doubleValue());
        newComplex.setImg(c1.getImg().doubleValue() - c2.getImg().doubleValue());
        return newComplex;
    }
}