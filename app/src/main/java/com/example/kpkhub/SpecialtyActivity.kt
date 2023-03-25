package com.example.kpkhub

import android.media.Image
import android.os.Bundle
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.get
import androidx.viewpager2.widget.ViewPager2
import com.example.kpkhub.R.drawable

class SpecialtyActivity : AppCompatActivity() {

    private val introSliderAdapter = IntroSliderAdapter(
        listOf(
            IntroSlider(
                "Облік і оподаткування»/ ОПП «Облік і оподаткування»",
                "Інформація про спеціальність\n" + "\n" +
                        "Освітньо-професійний ступінь − фаховий молодший бакалавр.\n" +
                        "Освітньо-професійна програма – Облік і оподаткування.\n" +
                        "Спеціальність – 071 Облік і оподаткування.\n" +
                        "Галузь знань – 07 Управління та адміністрування.\n" +
                        "Освітня кваліфікація – фаховий молодший бакалавр з обліку і оподаткування.\n" + "\n" +
                        "Термін навчання: 2 роки 10 місяців – на основі базової загальної середньої освіти (після 9 класу). 1 рік 10 місяців – на основі повної загальної середньої освіти (після 11 класу) / ДКР.\n" + "\n" +
                        "Форма здобуття освіти: денна, заочна.\n" +
                        "Академічні права випускників – здобуття освіти за: початковим рівнем (короткий цикл) вищої освіти; першим (бакалаврським) рівнем вищої освіти.\n" + "\n" +
                        "«Облік і оподаткування» є комплексною спеціальністю, яка дає можливість фахівцеві працювати у двох напрямах: бухгалтерському обліку та оподаткуванні.\n" + "\n" +
                        "Освітньо-професійна програма підготовки фахового молодшого бакалавра за спеціальністю 071 «Облік і оподаткування» сформована як оптимальне поєднання академічних та професійних вимог, орієнтована на формування у студентів компетентностей щодо обліку, контролю і оподаткування з акцентом на організацію облікового процесу, використання облікової інформації в управлінні підприємством з метою розв’язання типових виробничих завдань.\n" +
                        "В основі програми закладено інтегровану підготовку фахових молодших бакалаврів, що поєднує чітку практичну спрямованість навчання щодо бухгалтерського обліку, фінансового обліку та обліку в бюджетних установах, економіки підприємства, економічного аналізу, податкової системи, казначейської справи, бухгалтерської звітності підприємств.\n" + "\n" +
                        "Фахівці з обліку і оподаткування сьогодні не тільки здійснюють традиційні облік, аналіз та контроль, а й впроваджують стратегічні заходи для підвищення ефективності розвитку підприємства в майбутньому, ведуть податковий облік з точки зору оптимізації податкових розрахунків та надають податкові консультації.\n" +
                        "Випускники можуть працювати на підприємствах різних організаційно-правових форм та форм власності на посадах, які вимагають володіння компетентностями згідно з Національною рамкою кваліфікацій та Національним Класифікатором України: Класифікатор професій (ДК 003:2010). Фахівець може займати первинні посади бухгалтера, касира-експерта, рахівника, ревізора, інспектора з інвентаризації, інспектора-ревізора.\n" + "\n" +
                        "Жодне підприємство будь-якої форми власності на сьогоднішній день не може обійтися без послуг кваліфікованого фахівця з бухгалтерського обліку, адже всі вони зобов’язані вести бухгалтерську звітність, а всі інші види звітності (податкової, управлінської, статистичної, спеціальної) базуються саме на даних обліку. На сьогодні спеціальність «Облік і оподаткування» – це гарантія майбутнього працевлаштування за фахом та можливість успішного кар’єрного зростання.\n",
                R.drawable.oblik
            ),
            IntroSlider(
                "«Фінанси, банківська справа та страхування» / ОПП «Фінанси, банківська справа та страхування»",
                "Інформація про спеціальність\n" + "\n" +
                        "Освітньо-професійний ступінь − фаховий молодший бакалавр\n" +
                        "Освітньо-професійна програма – Фінанси, банківська справа та страхування\n" +
                        "Спеціальність – 072 Фінанси, банківська справа та страхування\n" +
                        "Галузь знань – 07 Управління та адміністрування\n" +
                        "Освітня кваліфікація – Фаховий молодший бакалавр з фінансів, банківської справи та страхування\n" + "\n" +
                        "Термін навчання: 2 роки 10 місяців – на основі базової загальної середньої освіти (після 9 класу). 1 рік 10 місяців – на основі повної загальної середньої освіти (після 11 класу) / ДКР\n" + "\n" +
                        "Форма здобуття освіти: денна, заочна\n" +
                        "Академічні права випускників – Здобуття освіти за: початковим рівнем (короткий цикл) вищої освіти; першим (бакалаврським) рівнем вищої освіти.\n" + "\n" +
                        "Метою освітньо-професійної програми є формування та розвиток загальних і професійних компетентностей для здобуття студентом знань і навичок ведення фінансової діяльності, успішного виконання професійних обов’язків у сфері фінансів, банківської справи та страхування.\n" +
                        "Предметна область містить знання з побудови фінансової системи та її значення для розвитку економіки держави, умов забезпечення ефективності фінансових відносин, особливостей функціонування фінансів підприємств та бюджетної системи, фінансового ринку та діяльності фінансових інституцій, інвестування та страхових послуг, банківських операцій та податкової системи, методів формування і використання фінансових ресурсів на мікро- та макрорівнях. Програма передбачає формування вмінь та практичних навичок застосування сучасних інструментів управління фінансами у сферах оподаткування, банківської, страхової, фінансово-інвестиційної діяльності підприємств та інших суб’єктів господарювання.\n" +
                        "Випускники спеціальності «Фінанси, банківська справа та страхування» можуть працювати на підприємствах різних форм власності, організаційно-правових форм господарювання та видів економічної діяльності, у банках та інших фінансових установах, у страхових компаніях, бюджетних установах, у фіскальних та інших контролюючих органах, державних органах.\n" +
                        "Фаховий молодший бакалавр з фінансів, банківської справи та страхування здатний виконувати такі професійні роботи та може обіймати первинні посади за Національним класифікатором України (ДК 003:2010), зокрема: фахівець в галузі фінансів та торгівлі; дилер та брокер із заставних та фінансових операцій; агент страховий; інспектор кредитний; інспектор обмінного пункту; бухгалтер та касир-експерт; інспектор-ревізор; інспектор податкової служби; ревізор-інспектор податковий; інспектор з контролю за цінами.",
                R.drawable.finance
            ),
            IntroSlider(
                "«Менеджмент» / ОПП «Менеджмент»",
                "Інформація про спеціальність\n" + "\n" +
                        "Освітньо-професійний ступінь − фаховий молодший бакалавр\n" +
                        "Освітньо-професійна програма – Менеджмент\n" +
                        "Спеціальність – 073 Менеджмент\n" +
                        "Галузь знань – 07 Управління та адміністрування\n" +
                        "Освітня кваліфікація – Фаховий молодший бакалавр з менеджменту\n" + "\n" +
                        "Термін навчання: 3 роки 6 місяців – на основі базової загальної середньої освіти (після 9 класу). 2 роки 6 місяців – на основі повної загальної середньої освіти (після 11 класу) / ДКР\n" + "\n" +
                        "Форма здобуття освіти: денна, заочна\n" +
                        "Академічні права випускників – Здобуття освіти за: початковим рівнем (короткий цикл) вищої освіти; першим (бакалаврським) рівнем вищої освіти.\n" + "\n" +
                        "Освітньо-професійна програма підготовки фахового молодшого бакалавра за спеціальністю 073 «Менеджмент» спрямована на надання базових теоретичних знань та формування практичних умінь і навичок, достатніх для успішного вирішення конкретних проблем і завдань професійної діяльності у сфері управління організаціями та їх підрозділами на засадах оволодіння системою фахових спеціальних компетентностей.\n" + "\n" +
                        "Метою програми є формування інтегральних, загальних та фахових компетентностей для здійснення цілеспрямованої організаційно-управлінської діяльності в підрозділах та підприємствах усіх галузей виробництва усіх форм власності, підготовка здобувачів фахової передвищої освіти до подальшого навчання за обраною спеціальністю.\n" + "\n" +
                        "Освітня програма формує знання, практичні навички та фахові компетентності щодо володіння сучасним інструментарієм менеджменту та обґрунтування напрямків із підвищення ефективності діяльності підприємства в ринкових умовах.\n" + "\n" +
                        "Освітній процес передбачає ґрунтовне вивчення основ сучасного менеджменту, економіки підприємства, підприємницької діяльності, організації виробництва, бухгалтерського обліку, маркетингу, економіки праці та соціально-трудових відносин, економічного аналізу, управління персоналом, комерційного та трудового права тощо.\n" + "\n" +
                        "Фахівець здатний виконувати роботу за професією, назва якої відповідає Національному класифікатору України «Класифікатор професій» ДК 003:2010: (3436.2) «Помічник керівника виробничого підрозділу», «Помічник керівника іншого основного підрозділу».\n" + "\n" +
                        "Сьогодні професія менеджера є однією із найпопулярніших, престижних і, що важливо, найзатребуваніших на ринку праці. Неможливо уявити будь - яке виробництво без менеджера. Кваліфікованих фахівців з такою спеціальністю чекають підприємства будь-яких форм власності і форм господарювання.",
                R.drawable.manager
            ),
            IntroSlider(
                "«Маркетинг» / ОПП «Маркетинг»",
                "Інформація про спеціальність\n" + "\n" +
                        "Освітньо-професійний ступінь – фаховий молодший бакалавр\n" +
                        "Освітньо-професійна програма – Маркетинг\n" +
                        "Спеціальність – 075 Маркетинг\n" +
                        "Галузь знань – 07 Управління та адміністрування\n" +
                        "Освітня кваліфікація – Фаховий молодший бакалавр з маркетингу\n" + "\n" +
                        "Термін навчання: 2 роки 10 місяців – на основі базової загальної середньої освіти (після 9 класу). 1 рік 10 місяців – на основі повної загальної середньої освіти (після 11 класу) / ДКР.\n" + "\n" +
                        "Форма здобуття освіти: денна, заочна\n" +
                        "Академічні права випускників – здобуття освіти за: початковим рівнем (короткий цикл) вищої освіти; першим (бакалаврським) рівнем вищої освіти.\n" + "\n" +
                        "Освітньо-професійна програма «Маркетинг» орієнтована на фахову професійну підготовку сучасних маркетологів, які є ініціативними та здатними до швидкої адаптації, враховуючи умови та виклики сучасності, за рахунок вивчення спеціалізованих маркетингових дисциплін, які формують найбільш затребувані навички для бізнес-діяльності.\n" + "\n" +
                        "Предметна область містить знання з фундаментального маркетингу, поведінки споживача, маркетингових досліджень, маркетингової товарної політики, маркетингового ціноутворення, маркетингових комунікацій, реклами, маркетингової збутової політики, сучасних інформаційних технологій в маркетингових дослідженнях. Значна частина навчальних дисциплін формує вміння, які дозволяють відкривати, успішно вести та розвивати власну справу, реалізувати програми стартапінгу.\n" + "\n" +
                        "Випускники освітньої-професійної програми «Маркетинг» можуть працевлаштовуватись на підприємствах будь-якої організаційно-правової форми, обіймати посади різного профілю та рівня в консультативних центрах, в банківських установах, в страхових компаніях, рекламних та освітніх закладах, на підприємствах, зокрема у підрозділах: маркетингу, логістики і постачання, маркетингових досліджень, інформаційного забезпечення, збуту, реклами, паблік рилейшнз та інших.\n" +
                        "Маркетологи сьогодні вважаються основними фахівцями з розвитку бізнесу у вітчизняних та іноземних компаніях. Випускники молодші бакалаври зі спеціальності 075 «Маркетинг» здатні виконувати професійні роботи і займати посади за Національним класифікатором України «Класифікатор професій» ДК 003:2010, зокрема: агент торговельний, агент комерційний, мерчендайзер, організатор із збуту, торговельний брокер (маклер), агент з комерційних послуг, агент рекламний, фахівець з інтерв’ювання.\n",
                R.drawable.marketing
            ),
            IntroSlider(
                "«Інженерія програмного забезпечення» / ОПП «Інженерія програмного забезпечення»",
                "Інформація про спеціальність\n" + "\n" +
                        "Освітньо-професійний ступінь – фаховий молодший бакалавр\n" +
                        "Освітньо-професійна програма – Інженерія програмного забезпечення\n" +
                        "Спеціальність – 121 Інженерія програмного забезпечення\n" +
                        "Галузь знань – 12 Інформаційні технології\n" +
                        "Освітня кваліфікація – фаховий молодший бакалавр з інженерії програмного забезпечення\n" + "\n" +
                        "Термін навчання: 3 роки 10 місяців – на основі базової загальної середньої освіти (після 9 класу). 2 роки 10 місяців – на основі повної загальної середньої освіти (після 11 класу) / ДКР\n" + "\n" +
                        "Форма здобуття освіти: денна, заочна\n" +
                        "Академічні права випускників – здобуття освіти за: початковим рівнем (короткий цикл) вищої освіти; першим (бакалаврським) рівнем вищої освіти.\n" + "\n" +
                        "За всесвітніми рейтингами програмування посідає одне з перших місць за рівнем престижності та, відповідно, оплати праці. Майбутні програмісти опановують мови програмування, сучасні системи автоматизованої обробки інформації, технології розробки програмного забезпечення, організацію комп’ютерних мереж, комп’ютерну графіку. Вивчають універсальні мови програмування: C, С++, С#, Java, PHP, сучасні платформи і середовища програмування, мову моделювання UML та пакети BPwin (ERWin), Rational Rose. Студенти коледжу проходять практику в провідних західних IT- компаніях SOFTSERVE, ABILLS, «СОФТДЖОРН-Україна», ТОВ «Best-run Consulting».\n" + "\n" +
                        "Фахівці за спеціальністю «Інженерія програмного забезпечення» можуть обіймати посади техніка-програміста, техніка інформаційно-обчислювального центру, техніка відділу програмування, посади управлінського персоналу в структурах по обслуговуванню комп’ютеризованих систем організацій та установ.\n" + "\n" +
                        "Випускники коледжу мають можливість продовжити навчання у Національному університеті «Львівська політехніка», Національному лісотехнічному університеті України та Івано-Франківському національному технічному університеті нафти і газу за скороченим терміном навчання для здобуття освітньо-кваліфікаційного рівня «бакалавр».",
                R.drawable.programmer
            ),
            IntroSlider(
                "«Галузеве машинобудування» / ОПП «Галузеве машинобудування»",
                "Інформація про спеціальність\n" + "\n" +
                        "Освітньо-професійний ступінь – фаховий молодший бакалавр\n" +
                        "Освітньо-професійна програма – Галузеве машинобудування\n" +
                        "Спеціальність – 133 Галузеве машинобудування\n" +
                        "Галузь знань – 13 Механічна інженерія\n" +
                        "Освітня кваліфікація – фаховий молодший бакалавр з галузевого машинобудування\n" + "\n" +
                        "Термін навчання: 3 роки 10 місяців – на основі базової загальної середньої освіти (після 9 класу). 2 роки 10 місяців – на основі повної загальної середньої освіти (після 11 класу) / ДКР\n" + "\n" +
                        "Форма здобуття освіти: денна, заочна\n" +
                        "Академічні права випускників – здобуття освіти за: початковим рівнем (короткий цикл) вищої освіти; першим (бакалаврським) рівнем вищої освіти.\n" + "\n" +
                        "Спеціальність 133 «Галузеве машинобудування» для тих, хто прагне навчитися: проектувати та конструювати машини та їх складові із застосуванням засобів автоматизованого проектування (САПР); виготовляти вироби на верстатах з числовим програмним керуванням (ЧПК) та 3D принтерах; займатись технічною експлуатацією та ремонтом обладнання. Актуальність цієї спеціальності зумовлена появою на виробництвах України значної кількості високотехнологічного обладнання, що створює великий попит на спеціалістів по обслуговуванню такої технікою, як у нас в Україні, так і за кордоном. Однак робота з такими верстатами вимагає професійних навичок в моделюванні, програмуванні та обслуговуванні.\n" + "\n" +
                        "Наші студенти навчаються в сучасних комп’ютерних аудиторіях, використовуючи найновіше програмне забезпечення. Багато уваги відводиться на вивчення студентами 3D моделювання. На основі 3D моделей формуються програми для верстатів з ЧПК, 3D принтерів.\n" + "\n" +
                        "Крім теоретичного навчання студенти на кожному курсі проходять практичне навчання: комп’ютерна практика, слюсарна та верстатна практика. В майстерні коледжу студенти виконують слюсарні, ковальські, зварювальні роботи; працюють за токарними, фрезерними, свердлильними верстатами, а також ведуть ремонтні роботи. Технологічну та переддипломну практику студенти проходять на вітчизняних деревообробних підприємствах та підприємстві у Польщі. Студенти спеціальності «Галузеве машинобудування» мають можливість проходити практику в Німеччині згідно договору з торгово-промисловою палатою м.Ерфурт, із можливим подальшим працевлаштуванням, або продовженням навчання.\n" + "\n" +
                        "Фахівці за спеціальністю «Галузеве машинобудування» можуть працювати на таких посадах: оператор-програміст верстата з ЧПК, спеціаліст по проектуванню виробів, технік по ремонту та обслуговуванню обладнання, технік по налагодженню верстатів з ЧПК, спеціаліст по комплексному інжинірингу, слюсар-ремонтник, технік-конструктор.",
                R.drawable.carmechanic
            ),
            IntroSlider(
                "«Автоматизація та комп’ютерно-інтегровані технології» / ОПП «Автоматизація та комп’ютерно-інтегровані технології»",
                "Інформація про спеціальність\n" + "\n" +
                        "Освітньо-професійний ступінь − фаховий молодший бакалавр\n" +
                        "Освітньо-професійна програма – Автоматизація та комп’ютерно-інтегровані технології\n" +
                        "Спеціальність – 151 Автоматизація та комп’ютерно-інтегровані технології\n" +
                        "Галузь знань – 15 Автоматизація та приладобудування\n" +
                        "Освітня кваліфікація – фаховий молодший бакалавр з автоматизації та комп’ютерно-інтегрованих технологій\n" + "\n" +
                        "Термін навчання: 3 роки 10 місяців – на основі базової загальної середньої освіти (після 9 класу) 2 роки 10 місяців – на основі повної загальної середньої освіти (після 11 класу) / ДКР.\n" + "\n" +
                        "Форма здобуття освіти: денна, заочна\n" +
                        "Академічні права випускників – здобуття освіти за: початковим рівнем (короткий цикл) вищої освіти; першим (бакалаврським) рівнем вищої освіти.\n" + "\n" +
                        "Спеціальність орієнтована на автоматизовані системи керування технологічними процесами виробництв різних галузей промисловості та високі сучасні технології із застосуванням комп’ютерної техніки як на стадії проектування, так і на стадії експлуатації.\n" +
                        "Підготовка фахівців пов’язана із проектуванням та експлуатацією комп’ютерно-інтегрованих комплексів автоматизації для виробництва та бізнесу, комп’ютерним моделюванням виробничих процесів, розробкою програмного забезпечення, експлуатацією автоматизованих систем на базі WEB-технологій, обслуговуванням контролерів та комп’ютерів.\n" +
                        "Фаховий молодший бакалавр з автоматизації та комп’ютерно-інтегрованих технологій – це висококваліфікований фахівець, який володіє знаннями та навичками з:\n" +
                        "– основ метрології і засобів технологічного контролю;\n" +
                        "– теорії автоматичного регулювання та автоматичних регуляторів;\n" +
                        "– електротехніки та електричних вимірювань;\n" +
                        "– автоматизації технологічних процесів;\n" +
                        "– монтажу та налагодження технічних засобів автоматизованих систем;\n" +
                        "– експлуатації та ремонту технічних засобів автоматизованих систем;\n" +
                        "– основ програмування та програмного забезпечення;\n" +
                        "– електроніки, мікроелектроніки і схемотехніки;\n" +
                        "– технічної механіки та деталей вузлів засобів автоматизації;\n" +
                        "– технічних засобів автоматизованих систем;\n" +
                        "– автоматизованого елекроприводу;\n" +
                        "– гнучкого автоматизованого виробництва та робототехнічних систем.\n" +
                        "Вагомою перевагою спеціальності є тісне поєднання програмних продуктів та апаратної частин. Написання програмного забезпечення під реальні виробничі процеси чи об’єкти різноманітних галузей виробництва.\n" +
                        "Випускники успішно працюють розробниками програмного та апаратного забезпечення, налагоджувальниками та проєктувальниками засобів робототехніки, інтелектуальних систем, потокових виробничих ліній, розумних будинків, займають керівні посади у відділах з автоматизації та метрології, а також реалізують себе у якості менеджерів проєктів, тестувальників програмного забезпечення, системних адміністраторів та ін.",
                R.drawable.avtomatization
            ),
            IntroSlider(
                "«Технології легкої промисловості» / ОПП «Технології легкої промисловості»",
                "Інформація про спеціальність\n" + "\n" +
                        "Освітньо-професійний ступінь − фаховий молодший бакалавр\n" +
                        "Освітньо-професійна програма – Технології легкої промисловості\n" +
                        "Спеціальність – 182 Технології легкої промисловості\n" +
                        "Галузь знань – 18 Виробництво та технології\n" +
                        "Освітня кваліфікація – фаховий молодший бакалавр з технологій легкої промисловості\n" +
                        "Термін навчання: 3 роки 10 місяців – на основі базової загальної середньої освіти (після 9 класу). 2 роки 10 місяців – на основі повної загальної середньої освіти (після 11 класу) / ДКР\n" + "\n" +
                        "Форма здобуття освіти: денна, заочна\n" +
                        "Академічні права випускників – здобуття освіти за: початковим рівнем (короткий цикл) вищої освіти; першим (бакалаврським) рівнем вищої освіти.\n" + "\n" +
                        "На великих, малих та середніх підприємствах виготовлення одягу, а також у сфері обслуговування зростає потреба у фахівцях легкої промисловості. Разом з цим зростають вимоги до рівня підготовленості спеціалістів, які затребувані роботодавцями.\n" + "\n" +
                        "На спеціальності «Технологія легкої промисловості» створені оптимальні умови для оволодіння навчальним матеріалом, які забезпечують позитивне ставлення до професії, схильність та інтерес до неї.\n" + "\n" +
                        "Студенти слідкують за поточними та перспективними напрямками моди, вивчають методики конструювання та стежать за інноваційними техніками та технологіями в індустрії. Вчаться обізнаності в матеріалознавстві, враховувати особливості виробу, що проектується, створювати за допомогою конструктивних рішень різноманітні силуети, об'єм і крій.\n" +
                        "Успішно оволодіти обраною професією та відчути її емоційну привабливість студенти мають можливість при проходженні навчальної практики в оснащеній сучасним обладнанням швейній майстерні. Під керівництвом кваліфікованого майстра отримуються навички та вміння виготовляти легкий та верхній одяг, створювати ансамблі.\n" + "\n" +
                        "Кожного року студенти проектують та виготовляють тематичні колекції одягу, що розвиває пізнавальні та творчі здібності майбутніх фахівців , створює умови для формування вольових та професійних властивостей особистості. Презентуючи власні ідеї на різних показах, учасники мають змогу заявити про себе в професійних колах, знайти потенційних замовників та роботодавців.\n" + "\n" +
                        "Наші випускники готові до виконання всіх видів професійної діяльності та здатні на однаково високому рівні виконувати професійні функції як дизайнера, конструктора, технолога та знають специфіку роботи підприємств різного рівня.\n" + "\n" +
                        "Ми з радістю чекаємо на тих, хто має спрямованість оволодіти обраною професією, набути якісних знань, розвивати свої ідеали та креативно втілювати свої ідеї у життя.",
                R.drawable.technology
            ),
            IntroSlider(
                "«Менеджмент» / ОПП «Менеджмент»",
                "Інформація про спеціальність\n" + "\n" +
                        "Освітньо-професійний ступінь − фаховий молодший бакалавр\n" +
                        "Освітньо-професійна програма – Деревообробні та меблеві технології\n" +
                        "Спеціальність – 205 Лісове господарство\n" +
                        "Галузь знань – 20 Аграрні науки та продовольство\n" +
                        "Освітня кваліфікація – фаховий молодший бакалавр з лісового господарства (деревообробні та меблеві технології)\n" + "\n" +
                        "Термін навчання: 3 роки 10 місяців – на основі базової загальної середньої освіти (після 9 класу). 2 роки 10 місяців – на основі повної загальної середньої освіти (після 11 класу) / ДКР\n" + "\n" +
                        "Форма здобуття освіти: денна, заочна\n" +
                        "Академічні права випускників – здобуття освіти за: початковим рівнем (короткий цикл) вищої освіти; першим (бакалаврським) рівнем вищої освіти.\n" + "\n" +
                        "Деревооброблення та створення меблів давно вийшло за рамки ремесла, це – справа творча, креативна і високотехнологічна. Сьогодні, вироби з дерева та меблі створюються не лише з використанням традиційних інструментів та обладнання, а й із широким залученням верстатів з числовим програмним керуванням (ЧПК). Все це робить професію деревообробника-мебляра не тільки потрібною, цікавою, а й високооплачуваною. На думку експертів ринку деревообробних технологій, вже сьогодні меблева галузь України відчуває значний дефіцит кадрів.\n" + "\n" +
                        "Обравши спеціальність 205 «Лісове господарство», студенти коледжу отримають поглиблену професійну та практичну підготовку в таких напрямках: технології деревооброблення із використанням верстатів з ЧПК; технології лісопиляльного, меблевого, столярно-будівельного виробництв; сушіння і захист деревини; дизайн інтер’єру та меблів.\n" + "\n" +
                        "Крім теоретичних знань студенти проходять практику в лабораторіях та виробничій майстерні коледжу. Починаючи з третього курсу навчання, студенти проходять повноцінну практику на кращих деревообробних підприємствах. Фахівці за даною спеціалізацією зможуть працювати як на сучасних меблевих виробництвах, так і створювати власні виробництва із виготовлення різноманітних меблевих виробів. Навчання на даній спеціалізації дозволить майбутньому фахівцю отримати досвід роботи на передових вітчизняних і закордонних меблевих підприємствах.",
                R.drawable.lisove
            ),

        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_specialty)
        val intro = findViewById<ViewPager2>(R.id.introSliderViewPager)
        intro.adapter = introSliderAdapter
        setupIndicators()
        setCurrentIndicator(0)
        intro.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                setCurrentIndicator(position)
            }
        })

        val exit = findViewById<Button>(R.id.exit)
        exit.setOnClickListener {
            finish()
        }

    }
    private fun setupIndicators(){
        val indicators = arrayOfNulls<ImageView>(introSliderAdapter.itemCount)
        val layoutParams: LinearLayout.LayoutParams = LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT)
        layoutParams.setMargins(8, 0, 8, 0)
        for (i in indicators.indices){
            val indicator = findViewById<LinearLayout>(R.id.indicatorsContainer)
            indicators[i] = ImageView(applicationContext)
            indicators[i].apply {
                this?.setImageDrawable(
                    ContextCompat.getDrawable(
                        applicationContext,
                        R.drawable.indicator_inactive
                    )
                )
                this?.layoutParams = layoutParams
            }
            indicator.addView(indicators[i])
        }
    }
    private fun setCurrentIndicator(index: Int){
        val indicator = findViewById<LinearLayout>(R.id.indicatorsContainer)
        val childCount = indicator.childCount
        for(i in 0 until childCount){
                val imageView = indicator[i] as ImageView
                if (i == index) {
                    imageView.setImageDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            drawable.indicator_active
                        )
                    )
                } else {
                    imageView.setImageDrawable(
                        ContextCompat.getDrawable(
                            applicationContext,
                            drawable.indicator_inactive
                        )
                    )
                }
        }
    }

}
