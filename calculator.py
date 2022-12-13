# -*- coding: utf-8 -*-

# Form implementation generated from reading ui file 'calculator.ui'
#
# Created by: PyQt5 UI code generator 5.15.7
#
# WARNING: Any manual changes made to this file will be lost when pyuic5 is
# run again.  Do not edit this file unless you know what you are doing.


from PyQt5 import QtCore, QtGui, QtWidgets


class Ui_Dialog(object):
    def setupUi(self, Dialog):
        Dialog.setObjectName("Dialog")
        Dialog.resize(886, 510)
        self.label = QtWidgets.QLabel(Dialog)
        self.label.setGeometry(QtCore.QRect(0, 0, 891, 511))
        self.label.setStyleSheet("background-color: qconicalgradient(cx:0, cy:0, angle:135, stop:0 rgba(255, 255, 0, 69), stop:0.375 rgba(255, 255, 0, 69), stop:0.423533 rgba(251, 255, 0, 145), stop:0.45 rgba(247, 255, 0, 208), stop:0.477581 rgba(255, 244, 71, 130), stop:0.518717 rgba(255, 218, 71, 130), stop:0.55 rgba(255, 255, 0, 255), stop:0.57754 rgba(255, 203, 0, 130), stop:0.625 rgba(255, 255, 0, 69), stop:1 rgba(255, 255, 0, 69));")
        self.label.setText("")
        self.label.setObjectName("label")
        self.label_2 = QtWidgets.QLabel(Dialog)
        self.label_2.setGeometry(QtCore.QRect(100, 10, 641, 61))
        self.label_2.setObjectName("label_2")
        self.ans = QtWidgets.QLabel(Dialog)
        self.ans.setGeometry(QtCore.QRect(70, 90, 741, 81))
        self.ans.setStyleSheet("background-color: rgb(255, 255, 255);")
        self.ans.setText("")
        self.ans.setObjectName("ans")
        self.clr = QtWidgets.QPushButton(Dialog)
        self.clr.setGeometry(QtCore.QRect(502, 220, 121, 41))
        self.clr.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.clr.setObjectName("clr")
        self.delete_2 = QtWidgets.QPushButton(Dialog)
        self.delete_2.setGeometry(QtCore.QRect(652, 220, 121, 41))
        self.delete_2.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.delete_2.setObjectName("delete_2")
        self.div = QtWidgets.QPushButton(Dialog)
        self.div.setGeometry(QtCore.QRect(650, 340, 121, 41))
        self.div.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.div.setObjectName("div")
        self.mul = QtWidgets.QPushButton(Dialog)
        self.mul.setGeometry(QtCore.QRect(500, 340, 121, 41))
        self.mul.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.mul.setObjectName("mul")
        self.point = QtWidgets.QPushButton(Dialog)
        self.point.setGeometry(QtCore.QRect(500, 410, 121, 41))
        self.point.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.point.setObjectName("point")
        self.plus = QtWidgets.QPushButton(Dialog)
        self.plus.setGeometry(QtCore.QRect(500, 280, 121, 41))
        self.plus.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.plus.setObjectName("plus")
        self.minus = QtWidgets.QPushButton(Dialog)
        self.minus.setGeometry(QtCore.QRect(650, 280, 121, 41))
        self.minus.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.minus.setObjectName("minus")
        self.equal = QtWidgets.QPushButton(Dialog)
        self.equal.setGeometry(QtCore.QRect(650, 410, 121, 41))
        self.equal.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.equal.setObjectName("equal")
        self.one = QtWidgets.QPushButton(Dialog)
        self.one.setGeometry(QtCore.QRect(70, 220, 121, 41))
        self.one.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.one.setObjectName("one")
        self.two = QtWidgets.QPushButton(Dialog)
        self.two.setGeometry(QtCore.QRect(210, 220, 121, 41))
        self.two.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.two.setObjectName("two")
        self.three = QtWidgets.QPushButton(Dialog)
        self.three.setGeometry(QtCore.QRect(350, 220, 121, 41))
        self.three.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.three.setObjectName("three")
        self.fore = QtWidgets.QPushButton(Dialog)
        self.fore.setGeometry(QtCore.QRect(70, 300, 121, 41))
        self.fore.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.fore.setObjectName("fore")
        self.five = QtWidgets.QPushButton(Dialog)
        self.five.setGeometry(QtCore.QRect(210, 300, 121, 41))
        self.five.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.five.setObjectName("five")
        self.six = QtWidgets.QPushButton(Dialog)
        self.six.setGeometry(QtCore.QRect(350, 300, 121, 41))
        self.six.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.six.setObjectName("six")
        self.seven = QtWidgets.QPushButton(Dialog)
        self.seven.setGeometry(QtCore.QRect(70, 380, 121, 41))
        self.seven.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.seven.setObjectName("seven")
        self.eight = QtWidgets.QPushButton(Dialog)
        self.eight.setGeometry(QtCore.QRect(210, 380, 121, 41))
        self.eight.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.eight.setObjectName("eight")
        self.nine = QtWidgets.QPushButton(Dialog)
        self.nine.setGeometry(QtCore.QRect(350, 380, 121, 41))
        self.nine.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.nine.setObjectName("nine")
        self.zero = QtWidgets.QPushButton(Dialog)
        self.zero.setGeometry(QtCore.QRect(210, 450, 121, 41))
        self.zero.setStyleSheet("background-color: rgb(0, 170, 255);\n"
"font: 75 12pt \"MS Shell Dlg 2\";")
        self.zero.setObjectName("zero")

        self.retranslateUi(Dialog)
        QtCore.QMetaObject.connectSlotsByName(Dialog)

    def retranslateUi(self, Dialog):
        _translate = QtCore.QCoreApplication.translate
        Dialog.setWindowTitle(_translate("Dialog", "Dialog"))
        self.label_2.setText(_translate("Dialog", "<html><head/><body><p align=\"center\"><span style=\" font-size:14pt;\">Kishore\'s Calculator</span></p></body></html>"))
        self.clr.setText(_translate("Dialog", "Clr"))
        self.clr.clicked.connect(self.action_clear)
        self.delete_2.setText(_translate("Dialog", "Del"))
        self.delete_2.clicked.connect(self.action_del)
        self.div.setText(_translate("Dialog", "/"))
        self.div.clicked.connect(self.action_div)
        self.mul.setText(_translate("Dialog", "*"))
        self.mul.clicked.connect(self.action_mul)
        self.point.setText(_translate("Dialog", "."))
        self.point.clicked.connect(self.action_point)
        self.plus.setText(_translate("Dialog", "+"))
        self.plus.clicked.connect(self.action_plus)
        self.minus.setText(_translate("Dialog", "-"))
        self.minus.clicked.connect(self.action_minus)
        self.equal.setText(_translate("Dialog", "="))
        self.equal.clicked.connect(self.action_equal)
        self.one.setText(_translate("Dialog", "1"))
        self.one.clicked.connect(self.action1)
        self.two.setText(_translate("Dialog", "2"))
        self.two.clicked.connect(self.action2)
        self.three.setText(_translate("Dialog", "3"))
        self.three.clicked.connect(self.action3)
        self.fore.setText(_translate("Dialog", "4"))
        self.fore.clicked.connect(self.action4)
        self.five.setText(_translate("Dialog", "5"))
        self.five.clicked.connect(self.action5)
        self.six.setText(_translate("Dialog", "6"))
        self.six.clicked.connect(self.action6)
        self.seven.setText(_translate("Dialog", "7"))
        self.seven.clicked.connect(self.action7)
        self.eight.setText(_translate("Dialog", "8"))
        self.eight.clicked.connect(self.action8)
        self.nine.setText(_translate("Dialog", "9"))
        self.nine.clicked.connect(self.action9)
        self.zero.setText(_translate("Dialog", "0"))
        self.zero.clicked.connect(self.action0)
    def action_equal(self):

        # get the label text
        equation = self.ans.text()

        try:
            # getting the ans
            result = eval(equation)

            # setting text to the label
            self.ans.setText(str(result))

        except:
            # setting text to the label
            self.ans.setText("Wrong Input")

    def action_plus(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + " + ")

    def action_minus(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + " - ")

    def action_div(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + " / ")

    def action_mul(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + " * ")

    def action_point(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + ".")

    def action0(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + "0")

    def action1(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + "1")

    def action2(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + "2")

    def action3(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + "3")

    def action4(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + "4")

    def action5(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + "5")

    def action6(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + "6")

    def action7(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + "7")

    def action8(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + "8")

    def action9(self):
        # appending label text
        text = self.ans.text()
        self.ans.setText(text + "9")

    def action_clear(self):
        # clearing the label text
        self.ans.setText("")

    def action_del(self):
        # clearing a single digit
        text = self.ans.text()
        print(text[:len(text) - 1])
        self.ans.setText(text[:len(text) - 1])



if __name__ == "__main__":
    import sys
    app = QtWidgets.QApplication(sys.argv)
    Dialog = QtWidgets.QDialog()
    ui = Ui_Dialog()
    ui.setupUi(Dialog)
    Dialog.show()
    sys.exit(app.exec_())