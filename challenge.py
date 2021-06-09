import requests

def deCipher(strC, num):
    result =""
    for char in strC:
        if char.isalpha():
            asciiCode = ord(char)-num
            if asciiCode<97:
                asciiCode+=26
            result += chr(asciiCode)
        elif char == ",":
            result += ":"
        elif char == "+":
            result += "."
        elif char == "?":
            result += "/"
    return result

strPart1 = deCipher("k12ww 7s49v ,?286?mv 27rq s33od4 6fh77k r4og2 hu+",3)
strPart2 = deCipher("yd23 un394 hti58 j934+0 67htr9 8?173h t23r96 rj8s3 y73x",5)
dataJson = requests.get(strPart1+strPart2)

emails = []
for item in dataJson.json():
    emails.append((item['email']))
print(emails)