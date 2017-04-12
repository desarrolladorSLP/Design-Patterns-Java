# Composite (Structural)

# Problem

Applications Needs to manipulate a hierarchy, where we treat every object as if 
it were a single object. It uses a tree structure to represent part or the whole
hierarchy.

# Solution 
1. Use a class (Composite) to define all branches and root classes
2. Use a Interface (Component) to define both branches and leaves
   - with methods to add and removing children
3. Use a class (Leaf) to define objects which contains no children
   - these objects can only have 1 parent (1 to many relationship)


# Actors
- Component / Primitive (Interface)
- Composite 
- Leafs

# Known Uses
- Menus
- Categories
- Interpreters



                    CEO
          -----------|-----------      
         /                       \
Back-end Manager          Front-end Manager
     |         \            |           | 
Mobile Manager  Dev        Dev         Dev   
 |        \ 
Dev      Dev