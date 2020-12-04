from translate import Translator
import sys

from_lang = sys.argv[1]
to_lang = sys.argv[2]
provider = sys.argv[3]

print(provider)

t = Translator(from_lang=from_lang, to_lang=to_lang)

result = t.translate(provider)

print(result.encode().decode("1251"), end="")

#[DEFAULT]
#from_lang = autodetect
#to_lang = de
#provider = mymemory
#secret_access_key =