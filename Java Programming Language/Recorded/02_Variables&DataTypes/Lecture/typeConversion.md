## Conversion happens only when 
    a. type is compatible
    b. destination type > source type

hierarchy for data type Conversion in ascending order

byte -> short -> int -> float -> long -> double


Type Casting

int marks = (int)(99.99f)  ----> This is allowed as this is forceful type conversion


Rules followed by Java for Type Promotion in Expressions (only while evaluating Expressions not otherwise)

1. Java automatically promotes each byte , short or char operand to int when evaluating an Expression [smaller datatypes are converted to int for standardization]
2. If one operand is long , float or double the whole expression is promoted to long, float or double respectively [The largest type is preferred for the result of the expression]



