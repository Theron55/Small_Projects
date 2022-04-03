import json
import pprint
import urllib.request
import urllib.parse
import ssl

ssl._create_default_https_context = ssl._create_unverified_context


base_url = "https://restcountries.com/v2/"

# base_url = "https://104.27.142.88/rest/v2/"

def make_country(name):
    url = base_url + "name/" + urllib.parse.quote(name) + "?fullText=true"

    req = urllib.request.Request(url, headers={
        "User-Agent": "Mozilla/5.0"
    })
    response = urllib.request.urlopen(req)
    raw = response.read()
    data = json.loads(raw)
    latlng = data[0]["latlng"]
    if latlng:
        longitude = latlng[1]
        latitude = latlng[0]
    else:
        longitude = latitude = 0
    currencies = []
    for code in data[0]["currencies"]:
        currencies.append(code["code"])
    subregion = data[0]["subregion"]
    return {
        "name" : name,
        "longitude" : longitude,
        "latitude" : latitude,
        "currencies" : currencies,
        "subregion" : subregion,
    }

def get_name(country):
    return country["name"]

def get_longitude(country):
    return country["longitude"]

def get_latitude(country):
    return country["latitude"]

def currency_codes(country):
    return country["currencies"]

def neighbors(country):
    url = base_url + "subregion/" + urllib.parse.quote(country["subregion"])
    response = urllib.request.urlopen(url)
    raw = response.read()
    data = json.loads(raw)
    result = []
    for c in data:
        if c["name"] != get_name(country):
            result.append(make_country(c["name"]))
    return result


if __name__ == '__main__':
    # Test our code
    country = make_country("Montserrat")
    print(country)
    print(currency_codes(country))
    print([get_name(n) for n in neighbors(country)])
