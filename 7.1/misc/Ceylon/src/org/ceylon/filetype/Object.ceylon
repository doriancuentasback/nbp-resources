shared abstract class Object() extends Void() {

    doc "A developer-friendly string representing the instance."
    shared formal String string;

    doc "Determine if this object belongs to the given Category
         or is produced by the iterator of the given Iterable
         object."
    shared Boolean element(Category|Iterable<Equality> category) {
        switch (category)
        case (is Category) {
            return category.contains(this);
        }
        case (is Iterable<Equality>) {
            if (is Equality self = this) {
                for (Equality x in category) {
                    if (x==self) {
                        return true;
                    }
                }
                fail {
                    return false;
                }
            }
            else {
                return false;
            }
        }
    }

}