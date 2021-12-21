# CNN: Corina Chen + Binktop, Nicole Chen + Duck, Nada Hameed + Ray

### Tests Performed:
* Created several Comparables of different lengths (5 mil, 10 mil, 50 mil, 100 mil) - not all are in the code due to heap error
* Populated Comparables with their index
* In linAv and binAv methods, ran corresponding searches 100 times, through 100 different random targets
* Got the total time of the time it took to run each method as a whole

### Results:
* Generally, for the 5 mil length array, the time taken for bin search and lin search was 0.09 and 0.02 milliseconds, respectively
* Generally, for the 10 mil length array, the time taken for bin search and lin search was 1.0 and 0.0 milliseconds, respectively
* Generally, for the 50 mil length array, the time taken for bin search and lin search was 1.0 and 1.0 milliseconds, respectively
* Generally, for the 100 mil length array, the time taken for bin search and lin search was 0.12 and 0.02 milliseconds, respectively

### Conclusions:
* Despite our initial hypothesis, linear search seems to run faster than binary search.
