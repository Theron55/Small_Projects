import json
import urllib.request

def main():
    zip = input("Enter your zip: ")
    url = "http://ziptasticapi.com/" + zip
    req = urllib.request.Request(url,
        headers={ "User-Agent" : "Mozilla/5.0" })
    res = urllib.request.urlopen(req)
    raw = res.read()
    data = json.loads(raw)
    print("Your city is " + data["city"])
if __name__ == "__main__":
    main()
