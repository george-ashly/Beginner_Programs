#PASSWORD STRENGTH CHECKER 

def lengthp(password):
    length = len(password)
    if length <= 12:
        return "Try again with longer passwords"
    else:
        return "Good to go!"
    
def capsp(password):
    for character in password:
        if character == character.upper() and character.isalpha():
            return "Contains caps, good!"
    return "Does not contain caps!" 

def numericp(password):
    for character in password:
        for num in range(0,10):
            if character == str(num):
                return "Yay, stronger with the digits!"
    return "Add numeric digits!"

def specialp(password):
    for character in password:
        if character != character.isalpha() and str(character.isdigit()):
            return "Great going with the special characters!"
    return "Add special characters!"
            
print("This is the free password strength checker!")
password = input("Enter your password: ")

print("Here's the detailed analysis: \n")
print("LENGTH: ", lengthp(password))
print("CAPS: ", capsp(password))
print("NUMERIC: " , numericp(password))
print("SPECIAL CHARACTERS: ", specialp(password))


