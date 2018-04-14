public class A {
int aField;
@Override
public boolean equals(Object o) {
if(this==o) {
return true;
}
if(o==null) {
return false;
}
if(!(o instanceof A)) {
return false;
}
A other = (A) o;
if (aField != other.aField)
return false;
return true;
}
}
