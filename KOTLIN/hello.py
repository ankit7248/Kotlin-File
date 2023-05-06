given_string = input('Enter a string: ')
s=""

for i in range(len(given_string)):
    if i % 2 == 0:
        s=s+given_string[i]

print("Odd characters",s)
