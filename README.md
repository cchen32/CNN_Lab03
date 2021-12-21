# CNN: Corina Chen + Binktop, Nicole Chen + Duck, Nada Hameed + Ray

### Tests Performed:
* Created several Comparables of different lengths (1, 10, 100,...increasing exponentially by 10 until 1,000,000,000)
* Populated Comparables with their index
* In linAv and binAv methods, ran corresponding searches 100000 times, through random targets
* Got the total time of the time it took to run each method as a whole

### Results:
* Arrays of size 1:
```
size: 1
binary search time: 14.0
linear search time: 5.0
```
* Array of size 10:
```
size: 10
binary search time: 4.0
linear search time: 4.0
```
* Array of size 100:
```
size: 100
binary search time: 3.0
linear search time: 5.0
```
* Array of size 1,000:
```
size: 1000
binary search time: 4.0
linear search time: 5.0
```
* Array of size 10,000:
```
size: 10000
binary search time: 4.0
linear search time: 14.0
```
* Array of size 100,000:
```
size: 100000
binary search time: 5.0
linear search time: 95.0
```
* Array of size 1,000,000:
```
size: 1000000
binary search time: 6.0
linear search time: 1153.0
```
* Array of size 10,000,000:
```
size: 10000000
binary search time: 7.0
linear search time: 21662.0
```
* Array of size 100,000,000 (Around this time, linear search is taking too long):
```
size: 100000000
binary search time: 13.0
```


### Conclusions:
* In smaller arrays, linear search runs faster. However, within a larger one, there is stronger evidence showing that binary searches are much, much faster.
* The larger the array gets, the slower linear search becomes, whereas binary search only takes a fraction of the time.
