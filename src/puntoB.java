public class B extends A {
int bField;
@Override
public boolean equals(Object o) {
if(this==o) {
return true;
}
if(!super.equals(o)) {
return false;
}
if(!(o instanceof B)) {
return false;
}
B other = (B) o
        if (bField != other.bField)
return false;
return true;
}
}