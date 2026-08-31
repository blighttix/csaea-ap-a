animals = ["cat", "dog", "blobfish", "shark", "owl", "toad"]

# Define a function that takes in the list above, and an animal 'name' as an argument.
# Loop through the list to check if it's there.
# Print "<animal> is in the list" or "<animal> is not in the list".
# Then call the function with the following tests: 

def check_animal(animal):
    for i in animals:
        if i == animal:
            print(f'{animal} is in the list')
            return
        else:
            print(f'{animal} is not in list')
            return
