/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Oct 2018
 * Created for: ICS4U
 * Triangle program functions, etc
 *
 ****************************************************************************/

import java.lang.Math;
import java.text.DecimalFormat;

public class Triangle {	
	private double _sideA;
	private double _sideB;
	private double _sideC;
	
	private double _angleA;
	private double _angleB;
	private double _angleC;
	
	boolean _isValid;
	
	private double _area;
	private double _perimeter;
	private String _type;
	
	private static double MAXANGSUM = 180;
	private static DecimalFormat DECFORM = new DecimalFormat(".##"); //format decimals to two places
	
	//constructor
	public Triangle (String combo,
			         double infoA,
					 double infoB,
					 double infoC) {
		
		if(combo.equalsIgnoreCase("AAS")) {
			this._angleA = infoA;
			this._angleC = infoB;
			this._sideC = infoC;
		}
		else if(combo.equalsIgnoreCase("ASA")) {
			this._angleA = infoA;
			this._sideC = infoB;
			this._angleB = infoC;
		}
		else if(combo.equalsIgnoreCase("SSA")) {
			this._sideB = infoA;
			this._sideC = infoB;
			this._angleB = infoC;
		}
		else if(combo.equalsIgnoreCase("SAS")) {
			this._sideB = infoA;
			this._angleA = infoB;
			this._sideC = infoC;
		}
		else if(combo.equalsIgnoreCase("SSS")) {
			this._sideA = infoA;
			this._sideB = infoB;
			this._sideC = infoC;
		}
	}
	
	public boolean isTriangleValid() {
		if (_sideA > 0 && _sideB > 0 && _sideC > 0) {
			// inequality theorem
			
			if (_sideA + _sideB > _sideC && _sideB + _sideC > _sideA && _sideA + _sideC > _sideB) {
				_isValid = true;
				return _isValid;
			}
			else {	
				_isValid = false;
				return _isValid;
			}
		}
		else {
			_isValid = false;
			return _isValid;
		}
	}
	
	public void getPerimeter() {
		_perimeter = _sideA + _sideB + _sideC;
	}
	
	public void getArea() {
		double semip = _perimeter / 2;
		_area = Math.sqrt(semip * (semip - _sideA) * (semip - _sideB) * (semip - _sideC));
	}
	
	public void calculate(String combo) {
		if(combo.equalsIgnoreCase("AAS")) {
			_angleB = MAXANGSUM - _angleA - _angleC;
			_sideA = (_sideC * Math.sin(Math.toRadians(_angleA))) / Math.sin(Math.toRadians(_angleC));
			_sideB = (_sideC * Math.sin(Math.toRadians(_angleB))) / Math.sin(Math.toRadians(_angleC));	
			System.out.print("\n" + _sideB);
		}
		else if(combo.equalsIgnoreCase("ASA")) {
			_angleC = MAXANGSUM - _angleA - _angleB;
			_sideA = (_sideC/Math.sin(Math.toRadians(_angleC))) * Math.sin(Math.toRadians(_angleA));
			_sideB = (_sideC/Math.sin(Math.toRadians(_angleC))) * Math.sin(Math.toRadians(_angleB));
		}
		else if(combo.equalsIgnoreCase("SSA")) {
			_angleC = (Math.asin((_sideC * Math.sin(Math.toRadians(_angleB))) / _sideB)) / Math.PI * MAXANGSUM;
			_angleA = MAXANGSUM - _angleB - _angleC;
			_sideA = (Math.sin(Math.toRadians(_angleA)) * _sideB) / Math.sin(Math.toRadians(_angleB));
		}
		else if(combo.equalsIgnoreCase("SAS")) {
			_sideA = Math.sqrt(Math.pow(_sideB, 2) + Math.pow(_sideC, 2) - 2 * _sideB * _sideC * Math.cos(Math.toRadians(_angleA)));
			_angleB = (Math.asin((_sideB * Math.sin(Math.toRadians(_angleA))) / _sideA)) / Math.PI * MAXANGSUM;
			_angleC = MAXANGSUM - _angleA - _angleB;
		}
		else if(combo.equalsIgnoreCase("SSS")) {
			_angleA = Math.acos((Math.pow(_sideB, 2) + Math.pow(_sideC, 2) - Math.pow(_sideA, 2)) /  (2 * _sideB * _sideC)) / Math.PI * MAXANGSUM;
			_angleB = Math.acos((Math.pow(_sideC, 2) + Math.pow(_sideA, 2) - Math.pow(_sideB, 2)) / (2 * _sideC * _sideA)) / Math.PI * MAXANGSUM;
			_angleC = MAXANGSUM - _angleA - _angleB;
		}
		else {
			//you should not be here
		}
	}
	
	public String classify() {
		if(_sideA == _sideB && _sideB == _sideC && _sideC == _sideA) {
			_type = "\nType: Equilateral";
			return _type;
		} 
		else if(_angleA == 90 || _angleB == 90 || _angleC == 90) {
			_type = "\nType: Right";
			return _type;
		} 
		else if (_angleA == _angleB || _angleB == _angleC || _angleC == _angleA) {
			_type = "\nType: Isosceles";
			return _type;
		} 
		else if(_angleA > 90 && _angleB > 90 && _angleC > 90) {
			_type = "\nType: Obtuse";
			return _type;
		} 
		else if(_angleA < 90 && _angleB < 90 && _angleC < 90) {
			_type = "\nType: Acute";
			return _type;
		} 
		else if(_sideA != _sideB && _sideB != _sideC && _sideC != _sideA) {
			_type = "\nType: Scalene";
			return _type;
		} 
		else {
			_type = "\ntesterror";
			return _type;
		}
	}
		
	public void print() {
		System.out.print("\nPerimeter: " + DECFORM.format(_perimeter) + " units" + "\nArea: " + DECFORM.format(_area) + " units");
	}
}
