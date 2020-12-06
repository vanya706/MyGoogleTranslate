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

'''
from google_trans_new import google_translator  
import sys

from_lang = sys.argv[1]
to_lang = sys.argv[2]
provider = sys.argv[3]

translator = google_translator()
#translate_text = translator.translate(provider,lang_src=from_lang,lang_tgt=from_lang) 
translate_text = translator.translate(provider,lang_tgt=to_lang)  
print(translate_text.encode().decode("1251"), end="")



'''