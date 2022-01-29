# This solution is actually too slow... I'll have to optimise it later


queries = [[1,2,100],[2,5,100],[3,4,100]]

n = 10

def arrayManipulation(n, queries):
    initialArray = [0] * n
    print(initialArray)

    for query in queries:
        for i in range(query[0]-1, query[1]):
            initialArray[i] += query[2]

    return max(initialArray)


print(arrayManipulation(n,queries))
