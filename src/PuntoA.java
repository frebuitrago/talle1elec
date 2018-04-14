public class A {
int aField;

@Override
public boolean equals(Object obj) {
if (this == obj)
return true;
if (obj == null)
return false;
if (!(obj instanceof A)) //<--
return false;
A other = (A) obj;
if (aField != other.aField)
return false;
return true;
}