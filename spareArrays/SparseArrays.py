

def matchingStrings(strings, queries):
    counts = []
    for i in queries:
        counts.append(strings.count(i))
    return counts

