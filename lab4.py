from json import load
from dicttoxml import dicttoxml
from xml.dom.minidom import parseString
import re
import time


def parsing(txt, idx):
    data = {}
    while True:
        if idx >= len(txt) or "}" in txt[idx]:
            break
        elif "{" in txt[idx]:
            temp_data, temp_idx = parsing(txt, idx + 1)
            data[txt[idx - 1]] = temp_data
            idx = temp_idx
        elif ": " in txt[idx]:
            data[txt[idx - 1]] = txt[idx + 1]
        idx += 1
    return data, idx


def sealing(data, file, lvl):
    for key in data:
        file.write("\t" * lvl + "<{}>".format(key))
        if isinstance(data[key], dict):
            file.write("\n")
            sealing(data[key], file, lvl + 1)
            file.write("\t" * lvl + "</{}>\n".format(key))
        else:
            file.write(data[key])
            file.write("</{}>\n".format(key))
    return 0


def re_parsing(txt, idx):
    data = {}
    while True:
        if idx >= len(txt) or re.match(r"(.*}+.*)+", txt[idx]):
            break
        elif re.match(r"(.*{+.*)+", txt[idx]):
            temp_data, temp_idx = parsing(txt, idx + 1)
            data[txt[idx - 1]] = temp_data
            idx = temp_idx
        elif re.match(r"(\s*:+\s*)+", txt[idx]):
            data[txt[idx - 1]] = txt[idx + 1]
        idx += 1
    return data, idx

def WML_sealing(data, file, lvl):
    for key in data:
        file.write("\t" * lvl + "<{}>".format(key))
        if isinstance(data[key], dict):
            file.write("\n")
            sealing(data[key], file, lvl + 1)
            file.write("\t" * lvl + "</{}>\n".format(key))
        else:
            file.write(data[key])
            file.write("</{}>\n".format(key))
    return 0


# ============= 1 задание =================
# start_time = time.time()
# for _ in range(100):
#     JSON_file = open("C:/Users/Илья/Desktop/ITMO/1 курс/Информатика/Практика/lab4/JSON.JSON", encoding="utf-8")
#     text = JSON_file.read().split('"')
#     JSON_file.close()
#
#     text, index = parsing(text, 1)
#
#     XML_file = open("C:/Users/Илья/Desktop/ITMO/1 курс/Информатика/Практика/lab4/XML-1.XML", "w", encoding="utf-8")
#     XML_file.write("<xml>\n")
#     sealing(text, XML_file, 1)
#     XML_file.write("</xml>")
#     XML_file.close()
# print("--- %s seconds ---" % (time.time() - start_time))

# ============= 2 задание =================
# start_time = time.time()
# for _ in range(100):
#     JSON_file = load(open("C:/Users/Илья/Desktop/ITMO/1 курс/Информатика/Практика/lab4/JSON.JSON", encoding="utf-8"))
#     xml = parseString(dicttoxml(JSON_file, attr_type=False))
#
#     XML_file = open("C:/Users/Илья/Desktop/ITMO/1 курс/Информатика/Практика/lab4/XML-2.XML", "w", encoding="utf-8")
#     XML_file.write(xml.toprettyxml())
#     XML_file.close()
# print("--- %s seconds ---" % (time.time() - start_time))

# ============= 3 задание =================
# start_time = time.time()
# for _ in range(100):
#     JSON_file = open("C:/Users/Илья/Desktop/ITMO/1 курс/Информатика/Практика/lab4/JSON.JSON", encoding="utf-8")
#     text = JSON_file.read().split('"')
#     JSON_file.close()
#
#     text, index = re_parsing(text, 1)
#
#     XML_file = open("C:/Users/Илья/Desktop/ITMO/1 курс/Информатика/Практика/lab4/XML-3.XML", "w", encoding="utf-8")
#     XML_file.write("<xml>\n")
#     sealing(text, XML_file, 1)
#     XML_file.write("</xml>")
#     XML_file.close()
# print("--- %s seconds ---" % (time.time() - start_time))

# ============= 4 задание =================
# JSON_file = open("C:/Users/Илья/Desktop/ITMO/1 курс/Информатика/Практика/lab4/JSON.JSON", encoding="utf-8")
# text = JSON_file.read().split('"')
# JSON_file.close()
#
# text, index = parsing(text, 1)
#
# WML_file = open("C:/Users/Илья/Desktop/ITMO/1 курс/Информатика/Практика/lab4/WML.WML", "w", encoding="utf-8")
# WML_file.write("<wml>\n")
# WML_sealing(text, WML_file, 1)
# WML_file.write("</wml>")
# WML_file.close()
